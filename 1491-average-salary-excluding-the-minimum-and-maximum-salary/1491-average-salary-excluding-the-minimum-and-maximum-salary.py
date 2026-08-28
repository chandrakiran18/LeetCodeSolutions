class Solution:
    def average(self, salary: List[int]) -> float:
        a=max(salary)
        b=min(salary)
        n=len(salary)-2
        sum=0
        for i in salary:
            sum+=i
        sum-=a
        sum-=b
        return sum/n
