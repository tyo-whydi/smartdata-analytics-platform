from fastapi import FastAPI
from pydantic import BaseModel

app = FastAPI(title="SmartData ML Service", version="0.1.0")


class PredictionRequest(BaseModel):
    values: list[float]


@app.get("/health")
def health():
    return {"status": "UP", "service": "smartdata-ml-service"}


@app.post("/predict")
def predict(payload: PredictionRequest):
    if not payload.values:
        return {"prediction": None, "message": "No values provided"}

    average = sum(payload.values) / len(payload.values)
    return {
        "prediction": round(average, 2),
        "message": "Demo prediction generated successfully"
    }
