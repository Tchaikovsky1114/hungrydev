package com.eremes.bmi_calculator

class Dish(val title: String, val description: String, val price: Int) {

    override fun toString(): String {
//        return super.toString() // 이건 그냥 주소값을 반환한다
        return title // title을 반환하게 override
    }
}