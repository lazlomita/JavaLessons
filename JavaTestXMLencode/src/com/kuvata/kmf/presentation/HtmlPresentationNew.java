package com.kuvata.kmf.presentation;

import com.kuvata.kmf.presentation.ReferencedFile;

public class HtmlPresentationNew extends Presentation {
	
	private String startPage;
	public ReferencedFile referencedFile;
	public Integer opacity;
	public Boolean setTransparentBg;
	public Boolean html5Hwaccel;
	private Boolean useChrome;
	private Boolean chromeDisableGpu;

	/**
	 * @return Returns the referencedFile.
	 */
	public ReferencedFile getReferencedFile() {
		return referencedFile;
	}
	/**
	 * @param referencedFile The referencedFile to set.
	 */
	public void setReferencedFile(ReferencedFile referencedFile) {
		this.referencedFile = referencedFile;
	}
	/**
	 * @return Returns the startPage.
	 */
	public String getStartPage() {
		return startPage;
	}
	/**
	 * @param startPage The startPage to set.
	 */
	public void setStartPage(String startPage) {
		this.startPage = startPage;
	}
	public Integer getOpacity() {
		return opacity;
	}
	public void setOpacity(Integer opacity) {
		this.opacity = opacity;
	}
	public Boolean getSetTransparentBg() {
		return setTransparentBg;
	}
	public void setSetTransparentBg(Boolean setTransparentBg) {
		this.setTransparentBg = setTransparentBg;
	}
	public Boolean getHtml5Hwaccel() {
		return html5Hwaccel;
	}
	public void setHtml5Hwaccel(Boolean html5Hwaccel) {
		this.html5Hwaccel = html5Hwaccel;
	}
	public Boolean getUseChrome() {
		return useChrome;
	}
	public void setUseChrome(Boolean useChrome) {
		this.useChrome = useChrome;
	}
	public Boolean getChromeDisableGpu() {
		return chromeDisableGpu;
	}
	public void setChromeDisableGpu(Boolean chromeDisableGpu) {
		this.chromeDisableGpu = chromeDisableGpu;
	}
}
