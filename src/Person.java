
public class Person {
private String name,middle_name,last_name,job_title,email,number_phone;
private int salary,age;

	public Person(String name, String middle_name, String last_name, String job_title, String email, String number_phone, int salary, int age) {
	this.name = name;
	this.middle_name = middle_name;
    this.last_name = last_name;
    this.job_title = job_title;
	this.email = email;
	this.number_phone = number_phone;
	this.salary = salary; 
	this.age = age;	 
	}
	void printInfo() {
	System.out.println("Имя: " + name + "\n" + "Отчество: " + middle_name + "\n" + "Фамилия: " + last_name + "\n" + "Должность: " + job_title + "\n" + "Электронная почта: " + email + "\n" + "Номер телефона: " + number_phone + "\n" + "Зарплата: " + salary + "\n" + "Возраст: " + age + "\n" );
	}
	public static void main(String[] args) {
		    Person[] persArray = new Person[5];
		    persArray[0] = new Person("Алексей", "Иванович", "Петров", "middle", "petrov.alexey@mail.ru", "89234567890", 200000, 28);
		    persArray[1] = new Person("Мария", "Сергеевна", "Смирнова", "middle", "smirnova.maria@mail.ru", "89451234567", 180000, 30);
		    persArray[2] = new Person("Никита", "Сергеевич", "Королёв", "middle", "korolev.01@mail.ru", "89856745896", 175000, 26);
		    persArray[3] = new Person("Дмитрий", "Валерьевич", "Кузнецов", "middle", "kuznetsov.dmitry@mail.ru", "89562347891", 220000, 23);
		    persArray[4] = new Person("Екатерина", "Николаевна", "Васильева", "middle", "vasilyeva.ekat@mail.ru", "89673456789", 250000, 33);
		    for(int i = 0; i<persArray.length; i++)
		    {
		    	persArray[i].printInfo();
		    }
		  }
		}
