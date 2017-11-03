@echo off
start /b docker stop mysql-user-management
start /b docker rm mysql-user-management
start /b docker-compose up -d
exit