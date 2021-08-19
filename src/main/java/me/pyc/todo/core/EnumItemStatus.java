package me.pyc.todo.core;

/**
 * @author pi
 * @date 2021/08/19 22:50:34
 **/
public enum EnumItemStatus {

    /**
     * 新建
     */
    NEW(0, "新建"),

    /**
     * 完成
     */
    DONE(1, "完成");

    private Integer code;
    private String desc;

    EnumItemStatus(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
