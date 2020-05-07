import groovy.transform.Canonical

enum Week {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

enum BookStore {
    FIRSTBOOK(1, 2),
    SECONDBOOK(2, 2),
    THIRDBOOK(3, 2)

    int id
    int page

    BookStore(int id, int page) {
        this.id = id
        this.page = page
    }
}

println BookStore.FIRSTBOOK.class.name

def varArgFun(String str, int ... ints) {
    println "${str}的可变变量为$ints"
}

int[] array = [1, 2, 3, 3, 2, 1]
varArgFun("可变", 1, 2, 3, 4, 5, 6)
println array.getClass().name
varArgFun("test", [1, 2, 3, 3, 2, 1] as int[])
varArgFun("gui", array)
@Canonical(excludes = "age,gender")
class Person {
    String name
    String age
    String gender
}

println new Person(name:"9",age:"7",gender:"99")
class Bird{
    void eat(){
        println "小鸟吃虫子"
    }
    void sing(){
        println "小鸟会唱歌"
    }
}
class Dog{
    void eat(){
        println "狗吃骨头"
    }

    void fee(){
        println "狗会吠"
    }
}

class Body{
    @Delegate Bird bird=new Bird()
    @Delegate Dog dog=new Dog()
}

Body body=new Body()
body.eat()
body.sing()
body.fee()