class Base {
    void show(Number number) {
        println "基类显示数据:${number}"
    }
}

class Son extends Base {
    @Override
    void show(Number number) {
        println "儿子显示父类的数据:${number}"
    }

    void show(BigDecimal bigDecimal) {
        println "儿子自己的数据显示:${bigDecimal}"
    }
}

def show(Base base) {
    base.show(new BigDecimal(37368376869721.368736786378))
}

show(new Base())
show(new Son())