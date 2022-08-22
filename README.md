# ForegroundService_Demo

- Sử dụng Foreground Service
- Nó sẽ hiển thị một cái notification lên để hiển thị foreground service

- Nó sẽ nhận được notification khi ta sử dụng foreground service
- Ta sẽ giao tiếp với service thông qua Notification

1.Khi thực hiện click button start service 
- Nó sẽ gửi dữ liệu editext tới MyService

![image](https://user-images.githubusercontent.com/65121835/185828480-86ca5e31-a1a3-46dd-ba3e-998d57b188ee.png)


- Tạo một MyApplication để notification

![image](https://user-images.githubusercontent.com/65121835/185828578-10ceffff-846e-496a-bb13-990acc49b61f.png)


- Khi gọi startService() thì nó sẽ vào onStartCommand()

![image](https://user-images.githubusercontent.com/65121835/185828694-ac4ad9d1-0d66-4700-9ffe-a2e4dfcce755.png)


+ Tại Service ta sẽ đưa service lên notification

![image](https://user-images.githubusercontent.com/65121835/185828780-7401996a-11e8-444b-9c7a-647674a5c219.png)

2.Khi thực hiện click stop ta sẽ gọi tới stopService()

![image](https://user-images.githubusercontent.com/65121835/185828834-362b013c-1f8d-44b6-92fd-826c443e27a5.png)

- Và nó sẽ gọi tới onDestroy()
