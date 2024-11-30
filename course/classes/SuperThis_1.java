class Parent {
  	int x;
  
	  void method() {
	      System.out.println("Метод родительского класса.");
 	  }

    	  Parent() {
	      System.out.println("Конструктор родительского класса.");
	  }
}

class Child extends Parent {
    int x;

	  void method() {
	    System.out.println("Метод подкласса.");
 	  }

	  Child() {
	      super(); // Вызов конструктора родительского класса
	      super.x = 30; // Обращение к элементу родительского класса
	      super.method(); // Вызов метода родитеского класса
	  }
}  
