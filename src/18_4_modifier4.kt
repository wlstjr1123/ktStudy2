// 상송관계와 접근제한자 (open, private..)
// open과 private은 함계 사용할 수 없다.

open class Super2 {
//    private fun myFunc() {
//
//    }

    open fun myFunc2() {}

    protected open fun myFunc3() {}
}

class Sub2_18_4:Super2() {
    // 상위의 접근제한 범위를 줄여서 하위에서 오버라이드 할 수는 없다.
//    override private fun myFunc2() {
//        super.myFunc2()
//    }

    // 상위에서 접근제한 범위를 넓혀서 하위에서 오버라이드를 할 수 있다/
    override fun myFunc3() {
        super.myFunc3()
    }

}