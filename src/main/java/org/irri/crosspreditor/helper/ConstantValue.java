package org.irri.crosspreditor.helper;

import com.vaadin.server.VaadinService;


public class ConstantValue{
    
    private static final String BSLASH = "\\";
    private static final String FSLASH = "/";
    public static final String BASE_PATH=VaadinService.getCurrent().getBaseDirectory().getAbsolutePath().replace(BSLASH, FSLASH);
    public static final String GLU_EST_FILE= BASE_PATH +"/WEB-INF/files/input/GluEst.csv";
    public static final String GLUPIN_EST_FILE= BASE_PATH +"/WEB-INF/files/input/GluPinEst.csv";
    public static final String GLUPINSPN_EST_FILE= BASE_PATH +"/WEB-INF/files/input/GluPinSpnEst.csv";
    
    public static final String GENETYPE_GLU="Glu";
    public static final String GENETYPE_GLUPIN="GluPin";
    public static final String GENETYPE_GLUPINSPN="GluPinSpn";
    public static final String TWO_WAY_CROSSTYPE="P1/P2";
    public static final String THREE_WAY_CROSSTYPE="P1/P2/P3";
    public static final String INBREEDING_RIL="RIL";
    public static final String INBREEDING_DH="DH";

    

}
