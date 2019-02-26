package com.kuvata.kmf.presentation;

public class ReferencedFile 
{
	private String fileloc;	// Relative path
    private Long filesize;  // In bytes
    
    /**
     * 
     *
     */
    public ReferencedFile()
    {}
    /**
     * 
     * @param fileloc
     */
    public ReferencedFile(String fileloc)
    {
        this.fileloc = fileloc;
    }
	
    /**
     * @return Returns the fileloc.
     */
    public String getFileloc() {
        return fileloc;
    }
    /**
     * @param fileloc The fileloc to set.
     */
    public void setFileloc(String fileloc) {
        this.fileloc = fileloc;
    }
	/**
	 * @return the filesize
	 */
	public Long getFilesize() {
		return filesize;
	}
	/**
	 * @param filesize the filesize to set
	 */
	public void setFilesize(Long filesize) {
		this.filesize = filesize;
	}

    
}
