# SmartData Analytics Platform

A modern data analytics and forecasting platform built for portfolio and real-world use cases. The project combines backend APIs, data processing, machine learning, and a dashboard to provide actionable insights from raw data.

## Overview

SmartData Analytics Platform is designed to help users:
- upload datasets in CSV/Excel format
- clean and preprocess data
- explore trends and aggregations
- run forecasting and predictive analysis
- visualize results in an interactive dashboard
- expose clean APIs for downstream systems

This project is ideal for demonstrating backend engineering, data engineering, analytics, and machine learning skills in a single portfolio project.

## Tech Stack

- Backend: Java 21 + Spring Boot 3
- Machine Learning Service: Python + FastAPI
- Frontend: React + Vite
- Database: PostgreSQL
- Containerization: Docker + Docker Compose
- Documentation: Swagger/OpenAPI + README

## Project Architecture

```text
┌─────────────────────┐      ┌────────────────────┐
│ React Frontend      │ ---> │ Spring Boot API     │
│ Dashboard           │      │ Data & Business     │
└─────────────────────┘      │ Logic               │
                               └─────────┬──────────┘
                                         │
                                         ▼
                               ┌────────────────────┐
                               │ PostgreSQL DB       │
                               └────────────────────┘
                                         │
                                         ▼
                               ┌────────────────────┐
                               │ Python ML Service   │
                               │ Forecasting / EDA   │
                               └────────────────────┘
```

## Core Features

- Dataset upload and validation
- Data cleaning and preprocessing
- Summary statistics and EDA
- Business metric dashboard
- Forecasting and prediction API
- Search and filtering on datasets
- Exportable reports
- Role-based access for admin users
- Dockerized deployment

## Suggested Business Use Cases

- E-commerce sales analytics
- Customer churn prediction
- Student performance forecasting
- Inventory trend analysis
- Social sentiment monitoring

## Repository Structure

```text
smartdata-analytics-platform/
├── backend/
│   ├── src/
│   ├── pom.xml
│   └── application.properties
├── ml-service/
│   ├── app/
│   ├── requirements.txt
│   └── README.md
├── frontend/
│   ├── src/
│   ├── public/
│   ├── package.json
│   └── vite.config.js
├── data/
│   ├── raw/
│   ├── processed/
│   └── sample/
├── docker/
│   ├── docker-compose.yml
│   └── Dockerfile
├── docs/
│   ├── architecture.md
│   ├── api.md
│   └── setup.md
├── .gitignore
├── README.md
├── LICENSE
└── .github/
    └── workflows/
```

## Quick Start

### Requirements

- Java 21+
- Maven
- Python 3.11+
- Node.js 20+
- Docker + Docker Compose

### Run backend

```bash
cd backend
mvn spring-boot:run
```

### Run ML service

```bash
cd ml-service
python -m venv .venv
source .venv/bin/activate
pip install -r requirements.txt
uvicorn app.main:app --reload --host 0.0.0.0 --port 8000
```

### Run frontend

```bash
cd frontend
npm install
npm run dev
```

### Run with Docker

```bash
cd docker
docker-compose up --build
```

## API Endpoints

Planned API endpoints include:
- `GET /api/health`
- `POST /api/datasets/upload`
- `GET /api/datasets`
- `GET /api/summary`
- `POST /api/analytics/forecast`
- `GET /api/reports`

## Roadmap

### Phase 1 - Core foundation
- repo setup
- backend skeleton
- database schema
- health endpoints

### Phase 2 - Data processing
- CSV upload
- validation
- preprocessing
- summary stats

### Phase 3 - ML analysis
- forecasting model
- EDA module
- prediction API

### Phase 4 - Dashboard
- React analytics dashboard
- charts and visualizations
- report export

### Phase 5 - Deployment
- Dockerization
- CI/CD
- documentation polish

## Portfolio Value

This project demonstrates:
- backend API development
- database design
- data processing skills
- machine learning integration
- frontend dashboard building
- full-stack product thinking
- production-style project organization

## Author

Tiyo Wahyudi

## License

This project is licensed under the MIT License.
