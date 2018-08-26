package com.jluzh.evan.design.principle.openclose;

public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(25, "java", 99.25d);
        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse) iCourse;
        System.out.println("id: "+ javaDiscountCourse.getId() + " 课程名称：" + javaDiscountCourse.getName() + " 课程打折后的价格："+ javaDiscountCourse.getDiscountPrice()+ " 课程原价：" + javaDiscountCourse.getPrice());
    }
}
