package com.itheima.demo04_sealed;

/**
 目标： JEP 360:Sealed Classes(Preview)密封的类和接口（预览）
 */
public sealed class Person permits Teacher , Student , SportMan , Doctor{ } //人类

final class Teacher extends Person { } //老师

sealed class Student extends Person permits MiddleSchoolStudent , UniversityStudent   { } //学生
final class MiddleSchoolStudent extends Student { }  //中学生
final class UniversityStudent extends Student { }  //大学生

non-sealed class SportMan extends Person { }  //运动员
non-sealed class Doctor extends Person{ } // 医生

class PingPongMan extends SportMan {
}


