/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author 91964
 */
abstract class Main {
        protected void update(int id, double score1, double score2, double score3, double score4, double score5, double average){} ;//Score
        protected void insert(int id, int sid, int semester, String course1, String course2, String course3,
            String course4, String course5, double score1, double score2, double score3, double score4, double score5, double average){};//Score
        protected void insert(int id,int sid,int semester,String course1,String course2,String course3,String course4,String course5){};//Course
        protected void update(int id,String sname,String date,String gender,String email,String phone,String father,String mother,
                           String address,String imagePath){};//Student
        protected void insert(int id,String sname,String date,String gender,String email,String phone,String father,String mother,
                String address,String imagePath){};//Student
   
}
