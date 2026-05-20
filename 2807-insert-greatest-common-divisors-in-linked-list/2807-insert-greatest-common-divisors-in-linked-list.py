# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def insertGreatestCommonDivisors(self, head: Optional[ListNode]) -> Optional[ListNode]:

        if head.next is None:
            return head
        n1=head
        n2=head.next
        while n2:
            gcd=self.gcd(n1.val,n2.val)
            gn=ListNode(gcd)
            
            n1.next=gn
            gn.next=n2

            n1=n2
            n2=n2.next

        return head

    def gcd(self,a,b):
        while b!=0:
            temp=b
            b=a%b
            a=temp
        return a
        