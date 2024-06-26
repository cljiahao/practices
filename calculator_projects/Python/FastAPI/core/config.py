import os
from pathlib import Path

from dotenv import load_dotenv

env_path = Path(".") / ".env"
load_dotenv(dotenv_path=env_path)

class Settings:
    PROJECT_NAME: str = "Calculator"
    PROJECT_VERSION: str = "1.0.0"

    ORIGIN = os.getenv("ORIGIN")

settings = Settings()