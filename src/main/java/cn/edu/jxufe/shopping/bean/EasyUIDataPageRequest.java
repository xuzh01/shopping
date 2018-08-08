package cn.edu.jxufe.shopping.bean;

/**
 * @Author cgg 891842749@qq.com
 * @Date 2018-08-08 10:02:07
 * @Description gitee:www.gitee.com/cgggitee/
 * github:https://github.com/love390/
 */
public class EasyUIDataPageRequest {
    private int page = 1;
    private int rows = 10;

    private String text;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
