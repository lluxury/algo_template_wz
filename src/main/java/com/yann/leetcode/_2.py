class Solution:
    def addTwoNumbers(self,l1,l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        pre = ListNode(0)
        pre_tail = pre
        carry = 0

        while l1 or l2 or carry:
            var1 = (l1.val if l1 else 0)
            var2 = (l2.val if l2 else 0)
            carry, out = divmod(var1 + var2 +carry , 10)

            pre_tail.next = ListNode(out
                                )
            pre_tail = pre_tail.next

            l1 = (l1.next if l1 else None)
            l2 = (l2.next if l2 else None)
        return pre.next
        
# 链表求和
# 思路1
# 虽然转str拼接列表的思路非常好,但是没有结果,也许版本改了

# 思路2
# 构造新的链表,处理后向进位
# 用三目运算来处理2种情况

# 流程
# 初始化一个节点值为0的空节点
# 再复制这个节点
# 定义除值 carry 为 0
# 遍历,当 l1,l2,余数存在
#     val1是l1的值,或0
#     val2是l2的值,或0
#     除值和余数 分别 为3值之和除10
#     链表尾的值为余数
#     链表重设为链表下一节点
#     l1同样重设下一节点,没有设空
#     l2同样
# 反回resutl的下一节点 ? 其实是pre么
