package cn.edu.jxufe.shopping.bean;

/**
 * @Author cgg 891842749@qq.com
 * @Date 2018-08-14 10:47:58
 * @Description gitee:www.gitee.com/cgggitee/
 * github:https://github.com/love390/
 */
public class AccessToken {

    private String accessToken;
    private long expreeTime;
    private String refreshToken;
    private String openid;
    private String scope;

    private long createTime;

    public AccessToken() {
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public long getExpreeTime() {
        return expreeTime;
    }

    public void setExpreeTime(long expreeTime) {
        this.expreeTime = expreeTime;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "AccessToken{" +
                "accessToken='" + accessToken + '\'' +
                ", expreeTime=" + expreeTime +
                ", refreshToken='" + refreshToken + '\'' +
                ", openid='" + openid + '\'' +
                ", scope='" + scope + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
