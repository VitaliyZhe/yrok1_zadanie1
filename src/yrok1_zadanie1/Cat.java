package yrok1_zadanie1;

public class Cat {
private String breed;//порода
private Boolean sex;//пол true-самец/ false- самка
private String name;// имя
private int age;//возраст
private String colour;// цвет шерсти
// Конструктор

public Cat(String breed, Boolean sex, String name, int age, String colour) {
	this.breed = breed;
	this.sex = sex;
	this.name = name;
	this.age = age;
	this.colour = colour;
}
public Cat() {
	super();
}
public String getBreed() {
	return breed;
}
public void setBreed(String breed) {
	this.breed = breed;
}
public Boolean getSex() {
	return sex;
}
public void Boolean(Boolean sex) {
	this.sex = sex;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
//кот идти
protected void catGo(){
System.out.println("Cat "+ getName()+ " is walking"+toString());	
}
protected void catEat(){
System.out.println("Cat "+ getName()+ " Eat");	
}
@Override
public String toString() {
	String sex;
	if(this.sex) {sex="Male";}else {sex="Female";}
	return " [breed=" + breed + ", sex=" + sex + ", name=" + name + ", age=" + age + ", colour=" + colour + "]";
}

}
