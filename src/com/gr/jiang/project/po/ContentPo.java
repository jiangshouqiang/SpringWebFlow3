package com.gr.jiang.project.po;

public class ContentPo {
	private Integer id ;
	private String contentDesc; //内容描述
	private String contentTile; //内容标题
	private String category;
	private String url ;//内容所属url
	private String indexUrl; //搜索url
	private String keyword;
	private String time;//内容时间
	private String creDt; //入库日期
	private String creTm; //入库时间
	private String image;
	private String slide;
	private String video;
	private String tm_stmp;
	public ContentPo() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContentDesc() {
		return contentDesc;
	}
	public void setContentDesc(String contentDesc) {
		this.contentDesc = contentDesc;
	}
	public String getContentTile() {
		return contentTile;
	}
	public void setContentTile(String contentTile) {
		this.contentTile = contentTile;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getIndexUrl() {
		return indexUrl;
	}
	public void setIndexUrl(String indexUrl) {
		this.indexUrl = indexUrl;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getCreDt() {
		return creDt;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	public String getCreTm() {
		return creTm;
	}
	public void setCreTm(String creTm) {
		this.creTm = creTm;
	}
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getSlide() {
		return slide;
	}
	public void setSlide(String slide) {
		this.slide = slide;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	public String getTm_stmp() {
		return tm_stmp;
	}
	public void setTm_stmp(String tm_stmp) {
		this.tm_stmp = tm_stmp;
	}
	@Override
	public String toString() {
		return "ContentPo [id=" + id + ", contentDesc=" + contentDesc
				+ ", contentTile=" + contentTile + ", category=" + category
				+ ", url=" + url + ", indexUrl=" + indexUrl + ", keyword="
				+ keyword + ", time=" + time + ", creDt=" + creDt + ", creTm="
				+ creTm + ", tm_stmp=" + tm_stmp + "]";
	}
	
}
