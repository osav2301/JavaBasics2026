package src.task2;

public class NotificationService {
    void send(NotificationSender sender, String text) {
		sender.send(text);
		System.out.println("The upper string was send via service");
	}
    void send(EmailSender sender, String text) {
		sender.send(text);
		System.out.println("The upper string was send via service && email");
	}
    void send(ConsoleSender sender, String text) {
		sender.send(text);
		System.out.println("The upper string was send via service && console");
	}
}
