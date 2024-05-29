# Write your MySQL query statement below
select query_name  , round(avg(rating / position),2) as quality,
round(avg(if(rating < 3,1,0)*100),2) as poor_query_percentage  from Queries 
WHERE query_name IS NOT NULL
group by query_name ;
