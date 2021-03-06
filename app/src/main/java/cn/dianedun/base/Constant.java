package cn.dianedun.base;

/**
 * Created by Administrator on 2017/6/20.
 */

public interface Constant {

    /**
     * 商品类型
     */
    interface SHOP_TYPE {
        int FUNCTION_TAB = 99;
//        int FLOW = 98;
        int COMMON = 0;
        String TYPE = "type";
        int LEASE = 2;
        int GROUP = 1;
    }

    /**
     * 租赁list类型
     */
    interface LEASE_TYPE {
        int CLASSIFY = 99;
        int COMMON_TITLE = 98;
        int SHOP_ITEM = 97;
        int SHOP_CONDITION = 96;
//        int SHOP_FLOW = 95;
    }

    /**
     * Activity Bundle
     */
    String ACTIVITY_BUNDLE = "b";
    interface TOOLBAR_TYPE{
        String TYPE = "t";
        int COMMON = 0;
        int SEARCH_TV = 1;
        int SEARCH_EDIT = 2;
    }

    /**
     * ShopItem
     * Hor - 1
     * Ver - 2
     */
    interface SHOPITEM_ORI{
        int HOR = 1;
        int VER = 2;
    }

    /**
     * BannerDetail
     */
    interface BANNER {
        String ITEMBEAN = "bean";
        String BANNER_TYPE = "banner_type";
        String POSITION = "0";
        int IMG = 0x0;
        int VIDEO = 0x1;
        int FILE = 0x2;
        String URL_FILE= "url";
        String URL_VIDEO= "url";
        String URL_IMG = "img";
    }

    /**
     * 筛选类型
     */
    interface TYPE_SELECT {
        int BRAND = 0;
        int ATTR = 1;
        int OTHER = 2;
    }

    /***
     * 首页Item 类型
     */
    interface TYPE_HOME {
        int BANNER = 0;
        int ACTIVITY_CLASSIFY = 1;
        int ACTIVITY_MODULE = 2;
        int ACTIVITY_GROUP = 3;
        int ACTIVITY_LIST = 4;
        int ACTIVITY_INTEGRAL = 91;
        int ACTIVITY_YELLOW = 92;
        int ACTIVITY_BLUE = 93;
    }

    /**
     * 我的Item 类型
     */
    interface TYPE_MINE {
        int HEAD = 100;
        int ORDER = 101;
        int PRICE = 102;
        int OTHER = 103;
    }

    /**
     * 订单fragment 类型
     * 全部
     * 待付款
     * 待成团
     * 待收货
     * 待评价
     */
    interface TYPE_FRAGMENT_ORDER{
        String TYPE = "type";
        String PTYPE = "ptype";
        int ALL = 0x00;
        int UNPAY = 0x01;
        int UNGROUP = 0x02;
        int UNTAKE = 0x03;
        int UNEVALUATE = 0x04;

        int ORDER_ALL = 0x5;
        int ORDER_RENT = 0x6;
        int ORDER_COMMON = 0x7;
    }

    /**
     * 拼团fragment 类型
     * 全部
     * 等待成团
     * 拼团成功
     * 拼团失败
     */
    interface TYPE_FRAGMENT_GROUP{
        String TYPE = "type";
        int ALL = 0x00;
        int UNGROUP = 0x01;
        int GROUPSUCSS = 0x02;
        int GROUPFAILD = 0x03;
    }

    /**
     * 地址fragment 类型
     */
    interface TYPE_PLACES{
        String TYPE = "type";
        String ENTITY = "entity";
        int ADD = 0x00;
        int UPDATE = 0x01;
        int NORMAL = 0x02;
        int SELECT = 0x03;
    }

    /***
     * Activity back 刷新
     */
    interface TYPE_RELUST {
        int CODE = 01;
        int CODE_SUCESS = 0;
        int CODE_FAILD = 1;
    }

    /**
     * 三状态
     */
    interface LOGIN_STATUS {
        int ZYGOTE = 0;
        int LOGIN = 1;
        int UNLOGIN = 2;
    }

    /**
     * 预览订单类型
     */
    interface PREORDER_TYPE{
        String TYPE = "type";
        int SHOPCAR = 0x1;
        int COMMONSHOP = 0x2;
        int LEASESHOP = 0x3;
        int TIMEKILL = 0x4;
        int GROUPON = 0x5;
    }

    /**
     * MainBottomBar
     */
    interface MAINBOTTOMBAR {
        String INDEX = "index";
    }

    /**
     *  0x1 - 修改登录密码
     *  0x2 - 设置支付密码
     */
    interface PWDTYPE {
        String TYPE = "type";
        int LOGIN = 0x1;
        int PAY = 0x2;
    }
}
