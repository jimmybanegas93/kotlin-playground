// Generated file do not edit, generated by io.requery.processor.EntityProcessor
package requery.person.entity;

import io.requery.meta.EntityModel;
import io.requery.meta.EntityModelBuilder;

import javax.annotation.Generated;

@Generated("io.requery.processor.EntityProcessor")
public class Models {
    public static final EntityModel ENTITY = new EntityModelBuilder("requery/person/entity")
    .addType(GroupEntity.$TYPE)
    .addType(GroupEntity_PersonEntity.$TYPE)
    .addType(PersonEntity.$TYPE)
    .addType(AddressEntity.$TYPE)
    .addType(PhoneEntity.$TYPE)
    .build();

    private Models() {
    }
}
