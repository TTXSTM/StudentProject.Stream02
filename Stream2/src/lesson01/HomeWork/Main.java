package lesson01.HomeWork;

public class Main {

			public static void main(String[] args) {
				Course c = new Course(new Cross(80), new Wall(5), new Water(100)); // Создаем полосу препятствий
				Team team = new Team("First command", new Human("Bob"), new Cat("Baksik"), new Dog("Bobick"), new Human("Ivan")); // Создаем команду
				c.doIt(team); // Просим команду пройти полосу
				team.showResults(); // Показываем результаты
			}

}
