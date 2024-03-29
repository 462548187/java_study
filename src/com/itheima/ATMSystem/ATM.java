package com.itheima.ATMSystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accounts = new ArrayList<Account>();

    Scanner sc = new Scanner(System.in);

    private Account loginAccount; // 记录当前登录的账户对象

    /**
     * 启动ATM系统
     */
    public void start() {
        while (true) {
            System.out.println("======欢迎您进入到了ATM系统======");
            System.out.println("1.用户登录");
            System.out.println("2.用户开户");
            System.out.println("3.退出");
            System.out.println("请输入您的选择：");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    // 登录
                    login();
                    break;
                case "2":
                    // 开户
                    createAccount();
                    break;
                case "3":
                    System.out.println("感谢您的使用，再见！");
                    System.exit(0);
                    break;
                default:
                    System.out.println("您的输入有误，请重新输入！");
            }
        }
    }

    private void createAccount() {
        // 1. 创建一个账户对象，用户封装用户的信息
        System.out.println("======欢迎您进入到了开户操作======");
        Account acc = new Account();

        // 2. 接收用户输入的信息
        System.out.println("请输入您的账户名称：");
        String userName = sc.next();
        acc.setUserName(userName);

        while (true) {
            System.out.println("请输入您的性别：");
            char sex = sc.next().charAt(0);
            if (sex == '男' || sex == '女') {
                acc.setSex(sex);
                break;
            } else {
                System.out.println("您的输入有误，只能是男或者女~");
            }
        }

        while (true) {
            System.out.println("请输入您的密码：");
            String password = sc.next();
            System.out.println("请再次输入您的密码：");
            String password2 = sc.next();

            if (password.equals(password2)) {
                acc.setPassword(password);
                break;
            } else {
                System.out.println("您两次输入的密码不一致，请重新输入！");
            }
        }

        while (true) {
            System.out.println("请输入您的取现限额：");
            double limit = sc.nextDouble();
            if (limit > 0) {
                acc.setLimit(limit);
                break;
            } else {
                System.out.println("您的输入有误，取现限额必须大于0~");
            }

        }

        // 重点：我们需要为这个账户生成一个卡号（由系统自动生成，8位数字表示，不能与其他账号的卡号重复）
        String newCardId = createCardId();
        acc.setCardId(newCardId);


        // 3. 将账户对象添加到集合中
        accounts.add(acc);
        System.out.println("恭喜您，" + acc.getUserName() + "开户成功，您的卡号是：" + acc.getCardId() + "，请牢记您的卡号！");

    }

    // 返回一个8位 数字的卡号，而且这个卡号不能与其他账号的卡号重复
    private String createCardId() {
        while (true) {
            // 1、定义一个String类型的变量记住8位数字作为卡号
            StringBuilder cardId = new StringBuilder();

            // 2、使用循环，循环8次，每次产生一个随机数给cardId连接起来
            Random r = new Random();
            for (int i = 0; i < 8; i++) {
                cardId.append(r.nextInt(10));
            }

            // 3、判断这个卡号是否已经存在
            Account acc = getAccountByCardId(cardId.toString());
            if (acc == null) {
                // 说明cardId 没有找到账户对象，因此cardId没有与其他账户的卡号重复，可以返回它作为一个新卡号
                return cardId.toString();
            }
        }

    }

    // 根据卡号查询账户对象
    private Account getAccountByCardId(String cardId) {
        // 1、遍历集合
        for (Account acc : accounts) {
            if (acc.getCardId().equals(cardId)) {
                return acc;
            }
        }
        return null;
    }

    // 登录功能
    private void login() {

        System.out.println("======欢迎您进入到了登录操作======");

        // 1、判断是否有用户开户
        if (accounts.isEmpty()) {
            System.out.println("对不起，目前还没有用户开户，请先开户！");
            return;
        }

        while (true) {
            // 2、系统中存在账户对象，可以开始进行登录操作
            System.out.println("请输入您的卡号：");
            String cardId = sc.next();

            Account acc = getAccountByCardId(cardId);

            if (acc == null) {
                System.out.println("对不起，您输入的卡号不存在，请重新输入！");
            } else {
                while (true) {
                    System.out.println("请输入您的密码：");
                    String password = sc.next();

                    if (acc.getPassword().equals(password)) {
                        loginAccount = acc;
                        System.out.println("恭喜您" + acc.getUserName() + "登录成功！您的卡号：" + acc.getCardId());
                        // 进入到用户的操作界面
                        showUserChoice();
                        return;
                    } else {
                        System.out.println("对不起，您输入的密码有误，请重新输入！");
                    }
                }

            }
        }

    }

    // 用户的操作界面
    private void showUserChoice() {

        while (true) {
            System.out.println(loginAccount.getUserName() + "，您好！您可以选择如下功能进行账户的处理：");
            System.out.println("1.查询余额");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.修改密码");
            System.out.println("6.退出");
            System.out.println("7.注销");
            System.out.println("请输入您的选择：");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    // 查询余额
                    showLoginAccount();
                    break;
                case 2:
                    // 存款
                    depositMoney();
                    break;
                case 3:
                    // 取款
                    withdrawMoney();
                    break;
                case 4:
                    // 转账
                    transferMoney();
                    break;
                case 5:
                    // 修改密码
                    changePassword();
                    return;
                case 6:
                    System.out.println(loginAccount.getUserName() + ",感谢您的使用，再见！");
                    return;
                case 7:

                    if (deleteAccount()) {
                        return;
                    }

                    break;
                default:
                    System.out.println("您的输入有误，请重新输入！");
            }
        }

    }

    private void changePassword() {
        System.out.println("======欢迎您进入到修改密码操作======");

        while (true) {
            // 1、提醒用户输入原密码
            System.out.println("请输入您的原密码：");
            String oldPassword = sc.next();

            // 2、判断原密码是否正确
            if (loginAccount.getPassword().equals(oldPassword)) {

                while (true) {
                    // 3、接收新密码
                    System.out.println("请输入您的新密码：");
                    String newPassword = sc.next();
                    // 4、再次输入新密码
                    System.out.println("请再次输入您的新密码：");
                    String newPassword2 = sc.next();

                    // 5、判断两次输入的新密码是否一致
                    if (newPassword.equals(newPassword2)) {
                        loginAccount.setPassword(newPassword);
                        System.out.println("恭喜您，您的密码修改成功！");
                        return;
                    } else {
                        System.out.println("对不起，您两次输入的新密码不一致，请重新输入！");
                    }
                }

            } else {
                System.out.println("对不起，您输入的原密码有误，请重新输入！");
            }
        }


    }

    private boolean deleteAccount() {
        System.out.println("======欢迎您进入到注销操作======");
        // 1、问问用户是否确定要注销账户
        System.out.println("您确定要注销账户吗？(Y/N)");
        String choice = sc.next();
        if (choice.equalsIgnoreCase("Y")) {
            if (loginAccount.getMoney() == 0) {
                // 2、删除账户
                accounts.remove(loginAccount);
                System.out.println("恭喜您，您的账户已经注销成功！");
                return true;

            } else {
                System.out.println("对不起，您的账户还有余额，不能注销。\t 您的账户余额有：" + loginAccount.getMoney() + "元");
                return false;
            }
        } else {
            System.out.println("好的，您的账户保留");
            return false;
        }
    }

    private void transferMoney() {
        System.out.println("======欢迎您进入到转账操作======");

        // 1、判断系统中是否有两个账户以上
        if (accounts.size() < 2) {
            System.out.println("对不起，目前系统中只有一个账户，不能进行转账操作！");
            return;
        }

        // 2、判断自己的余额是否大于0
        if (loginAccount.getMoney() == 0) {
            System.out.println("您自己都没钱，就别转了！");
            return;
        }

        while (true) {
            // 3、接收对方的卡号
            System.out.println("请输入对方的卡号：");
            String cardId = sc.next();

            // 4、判断对方的卡号是否存在
            Account acc = getAccountByCardId(cardId);

            // 自己不能转给自己
            if (loginAccount.getCardId().equals(cardId)) {
                System.out.println("对不起，您不能给自己转账！");
                break;
            }


            if (acc == null) {
                System.out.println("对不起，您输入的卡号不存在，请重新输入！");
            } else {
                // 对方的卡号存在，继续让用户认证姓氏
                String name = "*" + acc.getUserName().substring(1);
                System.out.println("请输入 【" + name + "】的姓氏：");
                String preName = sc.next();

                // 5、判断对方的姓氏是否正确
                if (acc.getUserName().startsWith(preName)) {

                    while (true) {
                        // 6、接收转账金额
                        System.out.println("请输入您要转账的金额：");
                        double money = sc.nextDouble();

                        // 7、判断转账金额是否大于0
                        if (money <= 0) {
                            System.out.println("对不起，您的转账金额必须大于0！");
                            return;
                        }

                        // 8、判断自己的余额是否大于转账金额
                        if (loginAccount.getMoney() > money) {

                            // 9、修改自己的余额
                            loginAccount.setMoney(loginAccount.getMoney() - money);

                            // 10、修改对方的余额
                            acc.setMoney(acc.getMoney() + money);

                            System.out.println("恭喜您，您的转账" + money + "成功，您的余额是：" + loginAccount.getMoney() + "元");
                            return;

                        } else {
                            System.out.println("您的余额不足,无法给对方转这么多钱，您的余额：" + loginAccount.getMoney() + "元");
                        }
                    }


                } else {
                    System.out.println("对不起，您输入的姓氏有误，请重新输入！");
                }

            }
        }

    }

    private void withdrawMoney() {

        // 余额必须大于100
        if (loginAccount.getMoney() < 100) {
            System.out.println("======欢迎您进入到取款操作======");
            System.out.println("对不起，您的余额不足100元，不能取款！");
            return;
        }

        while (true) {

            System.out.println("请输入您要取款的金额：");
            double money = sc.nextDouble();

            if (money <= 0) {
                System.out.println("对不起，您的取款金额必须大于0！");
                return;
            }

            if (loginAccount.getMoney() > money) {

                if (money > loginAccount.getLimit()) {
                    System.out.println("对不起，您的取款金额超过了您的取款限额，您的取款限额是：" + loginAccount.getLimit() + "元");
                }

                loginAccount.setMoney(loginAccount.getMoney() - money);

                System.out.println("恭喜您，您的取款" + money + "成功，您的余额是：" + loginAccount.getMoney() + "元");
                break;

            } else {
                System.out.println("对不起，您的余额不足，不能取款！");
            }
        }


    }

    // 存款
    private void depositMoney() {
        System.out.println("======欢迎您进入到存款操作======");
        System.out.println("请输入您要存款的金额：");
        double money = sc.nextDouble();

        // 1、判断存款金额是否大于0
        if (money <= 0) {
            System.out.println("对不起，您的存款金额必须大于0！");
            return;
        }

        // 2、修改账户的余额
        loginAccount.setMoney(loginAccount.getMoney() + money);

        System.out.println("恭喜您,您的存款" + money + "成功，您的余额是：" + loginAccount.getMoney() + "元");

    }

    // 查询余额
    private void showLoginAccount() {
        System.out.println("======您的账户信息如下======");
        System.out.println("卡号：" + loginAccount.getCardId());
        System.out.println("姓名：" + loginAccount.getUserName());
        System.out.println("性别：" + loginAccount.getSex());
        System.out.println("余额：" + loginAccount.getMoney());
        System.out.println("取现限额：" + loginAccount.getLimit());
    }

}
