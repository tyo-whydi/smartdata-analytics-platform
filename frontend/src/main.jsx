import React from 'react'
import ReactDOM from 'react-dom/client'

function App() {
  return (
    <div style={{
      fontFamily: 'Inter, sans-serif',
      background: '#0f172a',
      minHeight: '100vh',
      color: '#e2e8f0',
      display: 'flex',
      alignItems: 'center',
      justifyContent: 'center',
      flexDirection: 'column',
      gap: '12px'
    }}>
      <h1>SmartData Analytics Platform</h1>
      <p>Dashboard frontend is running successfully.</p>
      <p style={{ color: '#38bdf8' }}>Backend + ML service + dashboard ready for extension.</p>
    </div>
  )
}

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
)
