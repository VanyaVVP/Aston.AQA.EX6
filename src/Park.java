
public class Park {                // объявление полей класса Park

	private String park;
	private Attraction[] attraction; // Создан массив аттракционов
	
	public Park(String park, Attraction[] attraction) {      // Конструктор принимает название парка и массив аттракционов
    this.park = park;                                    
	this.attraction = attraction;                     
    }
	
	public void printInfo() {                     // Метод для вывода названия парка + инф-ии об аттракционах (обращается к методу класса Attraction)
	    System.out.println("Парк: " + park); 
	    for (int i = 0; i < attraction.length; i++) { 
	        attraction[i].printInfo(); 
	    } 
	}
	public class Attraction {                 // объявление полей класса Attraction
	private String attraction_name;
	private String finishing_work;
	private int age_limit;
	private int price_per_ticket;
	
	public Attraction(String attraction_name,String finishing_work, int age_limit, int price_per_ticket) { // Конструктор принимает информацию об аттракционах
		this.attraction_name=attraction_name;
		this.finishing_work=finishing_work;
		this.age_limit=age_limit;
		this.price_per_ticket=price_per_ticket;
	}
	public void printInfo() {   
	      System.out.println("Аттракцион: " + attraction_name + ", Окончание работы: " + finishing_work + 
	          ", Возрастное ограничение: с " + age_limit + " лет" + ", Цена: " + price_per_ticket);
	    }
	  }
	
		public static void main(String[] args) {
		Attraction[] attraction = new Attraction[5];      // Массив из 5 элементов
		attraction[0] = new Park("The best place in the world!", null).new Attraction("Карусели", "20:00", 6, 150);
		attraction[1] = new Park("The best place in the world!", null).new Attraction("Крутые горки", "22:00", 17, 250);
		attraction[2] = new Park("The best place in the world!", null).new Attraction("Дикие горки", "21:00", 12, 150);
		attraction[3] = new Park("The best place in the world!", null).new Attraction("Лошадки", "20:00", 6, 150);
		attraction[4] = new Park("The best place in the world!", null).new Attraction("Вихрь", "20:00", 12, 150);
		Park park = new Park("The best place in the world!", attraction);   // Передаётся название парка и массив в конструктор 
		park.printInfo();
	}
		}
		
