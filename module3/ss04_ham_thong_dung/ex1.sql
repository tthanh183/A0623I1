use studentsmanagerment;

select sub.subId, sub.subName, sub.credit
from subjects sub 
where sub.credit >= all ( select credit from subjects);

select sub.subId, sub.subName, m.mark
from subjects sub inner join marks m on sub.subId = m.subId
where m.mark >= all ( select mark from marks);


select stu.stuId, stu.stuName, avg(mark)
from students stu inner join marks m on m.stuId = stu.stuId
group by (stu.stuId)
order by avg(mark) desc;