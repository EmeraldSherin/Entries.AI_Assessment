nums=[]
n=int(input("Enter the size of array:"))
for i in range(n):
    nums.append(int(input()))
max1=-283940
max2=-283940
for i in range(n):
    if max1<nums[i]:
        max2=max1
        max1=nums[i]

for i in range(nums.index(max1)+1,n):
    if max2<nums[i]:
        max2=nums[i]
        
if max1==max2:
    print(-1)
else:      
    print("The Second Largest:",max2)