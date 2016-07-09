package seasky.spring.boot.bean;

/**
 * 
 * @author Administrator
 * @date 2016年7月9日
 */
public class PeopleData {
	private int baikeId;
	private String anme;
	private String alias;
	private String intro;

	public PeopleData() {
		super();
	}

	public PeopleData(int baikeId, String anme, String alias, String intro) {
		super();
		this.baikeId = baikeId;
		this.anme = anme;
		this.alias = alias;
		this.intro = intro;
	}

	public PeopleData(int baikeId, String anme) {
		super();
		this.baikeId = baikeId;
		this.anme = anme;
	}

	@Override
	public String toString() {
		return "PeopleData [baikeId=" + baikeId + ", anme=" + anme + ", alias="
				+ alias + ", intro=" + intro + "]";
	}

	public int getBaikeId() {
		return baikeId;
	}

	public void setBaikeId(int baikeId) {
		this.baikeId = baikeId;
	}

	public String getAnme() {
		return anme;
	}

	public void setAnme(String anme) {
		this.anme = anme;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

}
