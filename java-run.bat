@echo off

:: ===============================
:: Get the folder name of the current batch file
for %%* in ("%~dp0.") do set "PROJECT_NAME=%%~n*"

:: Set terminal title to the project folder name
title %PROJECT_NAME%

:: ===============================
:: Change working directory to the folder where this batch file is located
cd /d "%~dp0"

:: Enable UTF-8 encoding
chcp 65001 > nul

:: Variables (can be reused for any Java project)
set SRC_DIR=src
set OUT_DIR=out
set MAIN_CLASS=Main

echo Compiling Java files from "%SRC_DIR%"...

:: Create output folder if it doesn't exist
if not exist "%OUT_DIR%" mkdir "%OUT_DIR%"

:: Compile all Java files in src and subfolders
javac -d "%OUT_DIR%" "%SRC_DIR%\*.java"

if errorlevel 1 (
    echo Compilation failed!
    pause
    exit /b 1
)

echo Running program "%MAIN_CLASS%"...

:: Run the compiled Java program
java -cp "%OUT_DIR%" %MAIN_CLASS%

echo.
pause