package Object_4;

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {  // Animal 클래스를 상속한다.
    void sleep() {
        System.out.println(this.name+" zzz");
    }
}