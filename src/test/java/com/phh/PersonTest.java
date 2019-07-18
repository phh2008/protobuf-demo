package com.phh;

import com.google.protobuf.InvalidProtocolBufferException;
import org.junit.Test;

/**
 * <p> TODO
 *
 * @author phh
 * @version V1.0
 * @date 2019/7/18
 */
public class PersonTest {


    @Test
    public void test1() throws InvalidProtocolBufferException {
        PersonVO.Person.Builder builder = PersonVO.Person.newBuilder();
        builder.setId(10002);
        builder.setName("彭卉");
        builder.setEmail("phh@qq.com");

        PersonVO.Person person = builder.build();
        System.out.println("before:" + person);

        System.out.println("===Person Byte:");
        for (byte b : person.toByteArray()) {
            System.out.print(b);
        }
        System.out.println("\n================");

        byte[] byteArray = person.toByteArray();
        PersonVO.Person p2 = PersonVO.Person.parseFrom(byteArray);
        System.out.println("after id:" + p2.getId());
        System.out.println("after name:" + p2.getName());
        System.out.println("after email:" + p2.getEmail());
    }


}
