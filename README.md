## PersonRestApi
## Springboot RestfulApi 
## H2database 
## build in Docker 
## Deploy on Heroku
## CI/CD use Github Action
## test in Postman

Except GithubAction "Run Api Tests" failed, all actions succeeded. It may be that the request is different.
So i listed the manual test as a job check below:
### Get /findAll
![屏幕截图(80)](https://user-images.githubusercontent.com/90907656/143677860-2533b0c4-30f4-45f4-8e85-bca07f582c72.png)

### Get /findPersonById/1
![屏幕截图(81)](https://user-images.githubusercontent.com/90907656/143677917-9fe1519d-e5fb-47d4-b615-517c4b97782e.png)

### Post /addPerson
![屏幕截图(82)](https://user-images.githubusercontent.com/90907656/143678031-02f68916-3e74-43d0-8a79-e0f7ea11e6ea.png)
"name"="momo"
![屏幕截图(83)](https://user-images.githubusercontent.com/90907656/143678035-f5f9f581-07e3-4e2d-879a-e3b7662cc24d.png)
![屏幕截图(84)](https://user-images.githubusercontent.com/90907656/143678048-a0e37db7-8a44-4ffb-b1d0-57a6cdbd9ea4.png)

### Patch /updatePerson/4
![屏幕截图(85)](https://user-images.githubusercontent.com/90907656/143678084-ffa1c811-756f-4297-8e33-3d82b5f023d6.png)
"name"="wood"
![屏幕截图(86)](https://user-images.githubusercontent.com/90907656/143678096-2674879a-f773-445c-a170-1cbbf45ceecd.png)
![屏幕截图(87)](https://user-images.githubusercontent.com/90907656/143678112-f13f8ebf-ae47-4975-a341-6cb48f85f025.png)

### Delete /deletePerson/4
![屏幕截图(88)](https://user-images.githubusercontent.com/90907656/143678178-50132b2f-8759-434c-ab25-692e4865466f.png)
![屏幕截图(89)](https://user-images.githubusercontent.com/90907656/143678187-6a38ef83-383d-4ae3-aa98-c408a6457782.png)

