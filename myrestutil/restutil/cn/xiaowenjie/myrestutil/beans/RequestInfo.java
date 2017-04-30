package cn.xiaowenjie.myrestutil.beans;

import java.util.LinkedHashMap;

/**
 * 请求信息包装类
 * 
 * @author 肖文杰
 * @date 2017.4.30
 */
public class RequestInfo {

	private String url;

	private Class<?> returnType;

	private LinkedHashMap<String, String> params;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Class<?> getReturnType() {
		return returnType;
	}

	public void setReturnType(Class<?> returnType) {
		this.returnType = returnType;
	}

	public LinkedHashMap<String, String> getParams() {
		return params;
	}

	public void setParams(LinkedHashMap<String, String> params) {
		this.params = params;
	}

	@Override
	public String toString() {
		return "RequestInfo [url=" + url + ", returnType=" + returnType + ", params=" + params + "]";
	}

}