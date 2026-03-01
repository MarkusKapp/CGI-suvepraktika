<script setup>
import { ref, onMounted } from 'vue'
import apiClient from '@/services/api'

// Reactive state
const tables = ref([])
const loading = ref(false)
const error = ref(null)

const fetchBooks = async () => {
  loading.value = true
  try {
    const response = await apiClient.get('public/tables')
    tables.value = response.data
  } catch (err) {
    error.value = 'Failed to load tables'
    console.error('Error:', err)
  } finally {
    loading.value = false
  }
}


// Load books when component mounts
onMounted(() => {
  fetchBooks()
})

// Functions defined in next slide...
</script>

<template>
  <div>
    <p v-if="loading">Loading...</p>
    <p v-else-if="error">{{ error }}</p>
    <table v-else-if="tables.length">
      <thead>
        <tr>
          <th>ID</th>
          <th>Capacity</th>
          <th>Zone</th>
          <th>Has Window</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="table in tables" :key="table.id">
          <td>{{ table.id }}</td>
          <td>{{ table.capacity }}</td>
          <td>{{ table.zone }}</td>
          <td>{{ table.has_window ? 'Yes' : 'No' }}</td>
        </tr>
      </tbody>
    </table>
    <p v-else>No tables found.</p>
  </div>
</template>
