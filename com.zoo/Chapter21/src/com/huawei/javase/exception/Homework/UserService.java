package com.huawei.javase.exception.Homework;
/*
�û�ҵ���࣬�����û���ص�ҵ�������¼��ע��ȹ��ܡ�
 */
public class UserService {
    
    /**
     * 
     * @param username �û���
     * @param password ����
     * @throws IllegalArgumentsExceptionYan ���û���Ϊnull�������û�������С��6�����߳��ȴ���14������ָ��쳣��
     */
    public void register(String username, String password) throws IllegalArgumentsExceptionYan {
        /*
        ���õ���null������ж���÷ŵ�������������ǰ�档
         */
        /*if(username == null || username.length() < 6 || username.length() > 14){
        }*/

        /*
        �ٷ���һ�����飺username == null ����д�� null == username
        "abc".equals(username) �� username.equals("abc") �á�
         */
        /*if(null == username || username.length() < 6 || username.length() > 14){
        }*/
        if(username == null || username.length() < 6 || username.length() > 14) {
            throw new IllegalArgumentsExceptionYan("�û������Ϸ������ȱ�����[6-14]֮��");
        }
        // �����ܹ�ִ�е��˴�˵�����û����Ϸ�
        System.out.println("ע��ɹ�����ӭ["+username+"]");
    }
}
