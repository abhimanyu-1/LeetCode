# Write your MySQL query statement below
select firstname,lastname,city,state
from Person p
left join Address a on a.personId = p.personId;
