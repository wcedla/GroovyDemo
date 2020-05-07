class A {
    void action() {
        println "A执行"
    }
}

class B {
    void action() {
        println "B执行"
    }
}

class C {
    void action() {
        println "C执行"
    }
}

def doAction(object) throws RuntimeException {
    if (object.metaClass.respondsTo(object, "action")) {
        object.action()
    } else {
        throw new RuntimeException("can't find method!")
    }
}

try {
    doAction(new A())
    doAction(new B())
    doAction(new C())
} catch (ex) {
    println "出问题了${ex.message}"
}