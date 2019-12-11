package org.code.blocks.designpattern.j2ee.compositeentity;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public class CompositeEntity {

    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2){
        cgo.setData(data1, data2);
    }

    public String[] getData(){
        return cgo.getData();
    }
}
