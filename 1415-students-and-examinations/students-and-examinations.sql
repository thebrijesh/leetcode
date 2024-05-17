# Write your MySQL query statement below
select s.student_id, s.student_name , sj.subject_name , count(e.subject_name ) as attended_exams 
from Students as s
 join Subjects  as sj
 left join Examinations as e on s.student_id = e.student_id and e.subject_name = sj.subject_name
   
group by s.student_id , sj.subject_name
order by s.student_id, sj.subject_name ;