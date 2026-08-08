# Write your MySQL query statement below
select round(sum(tiv_2016),2) as tiv_2016 
from insurance i
where (select count(pid) 
        from insurance
        where lat=i.lat 
        and lon=i.lon)<2 
    and (select count(pid) 
        from insurance 
        where tiv_2015 = i.tiv_2015) > 1;