from typing import Optional
from fastapi import status
from fastapi import responses
from fastapi import Request
from fastapi import APIRouter
from fastapi.templating import Jinja2Templates


router = APIRouter()
templates = Jinja2Templates(directory="templates")


@router.get("/")
def home(request: Request, alert: Optional[str] = None):
    return templates.TemplateResponse(
        "home.html", {"request": request, "alert": alert}
    )

