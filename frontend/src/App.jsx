import React from 'react'
import ReactDOM from 'react-dom/client'
import './styles.css'

function App() {
  const [health, setHealth] = React.useState({ status: 'loading', service: '...' })
  const [summary, setSummary] = React.useState({ totalDatasets: 0, message: 'Loading...' })

  React.useEffect(() => {
    fetch('http://localhost:8080/api/health')
      .then((res) => res.json())
      .then((data) => setHealth(data))
      .catch(() => setHealth({ status: 'OFFLINE', service: 'backend' }))

    fetch('http://localhost:8080/api/datasets/summary')
      .then((res) => res.json())
      .then((data) => setSummary(data))
      .catch(() => setSummary({ totalDatasets: 0, message: 'Summary unavailable' }))
  }, [])

  return (
    <div className="app-shell">
      <header className="hero">
        <p className="eyebrow">Portfolio Project</p>
        <h1>SmartData Analytics Platform</h1>
        <p className="subtitle">
          Data mining, forecasting, and analytics dashboard built for real-world use cases.
        </p>
      </header>

      <section className="stats-grid">
        <div className="card">
          <span>Backend Status</span>
          <strong>{health.status}</strong>
          <small>{health.service}</small>
        </div>
        <div className="card">
          <span>Total Datasets</span>
          <strong>{summary.totalDatasets}</strong>
          <small>{summary.message}</small>
        </div>
        <div className="card">
          <span>Framework</span>
          <strong>Spring Boot</strong>
          <small>+ Python ML</small>
        </div>
        <div className="card">
          <span>Goal</span>
          <strong>Portfolio</strong>
          <small>Big data ready</small>
        </div>
      </section>

      <section className="panel">
        <h2>Core Features</h2>
        <ul>
          <li>Dataset upload and validation</li>
          <li>Data cleaning and preprocessing</li>
          <li>Forecast and prediction endpoints</li>
          <li>Analytics dashboard</li>
          <li>Reporting and summary metrics</li>
        </ul>
      </section>
    </div>
  )
}

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
)
