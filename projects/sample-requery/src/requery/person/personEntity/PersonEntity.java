// Generated file do not edit, generated by io.requery.processor.EntityProcessor
package requery.person.personEntity;

import io.requery.CascadeAction;
import io.requery.Persistable;
import io.requery.ReferentialAction;
import io.requery.meta.Attribute;
import io.requery.meta.AttributeBuilder;
import io.requery.meta.Cardinality;
import io.requery.meta.ListAttributeBuilder;
import io.requery.meta.QueryAttribute;
import io.requery.meta.QueryExpression;
import io.requery.meta.ResultAttributeBuilder;
import io.requery.meta.SetAttributeBuilder;
import io.requery.meta.Type;
import io.requery.meta.TypeBuilder;
import io.requery.proxy.EntityProxy;
import io.requery.proxy.IntProperty;
import io.requery.proxy.Property;
import io.requery.proxy.PropertyState;
import io.requery.query.MutableResult;
import io.requery.util.function.Function;
import io.requery.util.function.Supplier;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Generated;

@Generated("io.requery.processor.EntityProcessor")
public class PersonEntity implements Person, Persistable {
    public static final QueryExpression<Integer> ADDRESS_ID = 
    new AttributeBuilder<PersonEntity, Integer>("address", int.class)
    .setGenerated(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .setForeignKey(true)
    .setReferencedClass(AddressEntity.class)
    .setReferencedAttribute(new Supplier<Attribute>() {
        @Override
        public Attribute get() {
            return AddressEntity.ID;
        }
    })
    .setDeleteAction(ReferentialAction.CASCADE)
    .setUpdateAction(ReferentialAction.CASCADE)
    .setMappedAttribute(new Supplier<Attribute>() {
        @Override
        public Attribute get() {
            return AddressEntity.PERSON;
        }
    })
    .build();

    public static final QueryAttribute<PersonEntity, Address> ADDRESS = 
    new AttributeBuilder<PersonEntity, Address>("address", Address.class)
    .setProperty(new Property<PersonEntity, Address>() {
        @Override
        public Address get(PersonEntity entity) {
            return entity.address;
        }

        @Override
        public void set(PersonEntity entity, Address value) {
            entity.address = value;
        }
    })
    .setPropertyName("getAddress")
    .setPropertyState(new Property<PersonEntity, PropertyState>() {
        @Override
        public PropertyState get(PersonEntity entity) {
            return entity.$address_state;
        }

        @Override
        public void set(PersonEntity entity, PropertyState value) {
            entity.$address_state = value;
        }
    })
    .setGenerated(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .setForeignKey(true)
    .setReferencedClass(AddressEntity.class)
    .setReferencedAttribute(new Supplier<Attribute>() {
        @Override
        public Attribute get() {
            return AddressEntity.ID;
        }
    })
    .setDeleteAction(ReferentialAction.CASCADE)
    .setUpdateAction(ReferentialAction.CASCADE)
    .setCardinality(Cardinality.ONE_TO_ONE)
    .setMappedAttribute(new Supplier<Attribute>() {
        @Override
        public Attribute get() {
            return AddressEntity.PERSON;
        }
    })
    .build();

    public static final Attribute<PersonEntity, Set<Phone>> PHONE_NUMBERS_SET = 
    new SetAttributeBuilder<PersonEntity, Set<Phone>, Phone>("phoneNumbersSet", Set.class, Phone.class)
    .setProperty(new Property<PersonEntity, Set<Phone>>() {
        @Override
        public Set<Phone> get(PersonEntity entity) {
            return entity.phoneNumbersSet;
        }

        @Override
        public void set(PersonEntity entity, Set<Phone> value) {
            entity.phoneNumbersSet = value;
        }
    })
    .setPropertyName("getPhoneNumbersSet")
    .setPropertyState(new Property<PersonEntity, PropertyState>() {
        @Override
        public PropertyState get(PersonEntity entity) {
            return entity.$phoneNumbersSet_state;
        }

        @Override
        public void set(PersonEntity entity, PropertyState value) {
            entity.$phoneNumbersSet_state = value;
        }
    })
    .setGenerated(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .setCardinality(Cardinality.ONE_TO_MANY)
    .setMappedAttribute(new Supplier<Attribute>() {
        @Override
        public Attribute get() {
            return PhoneEntity.OWNER;
        }
    })
    .build();

    public static final Attribute<PersonEntity, List<Phone>> PHONE_NUMBERS_LIST = 
    new ListAttributeBuilder<PersonEntity, List<Phone>, Phone>("phoneNumbersList", List.class, Phone.class)
    .setProperty(new Property<PersonEntity, List<Phone>>() {
        @Override
        public List<Phone> get(PersonEntity entity) {
            return entity.phoneNumbersList;
        }

        @Override
        public void set(PersonEntity entity, List<Phone> value) {
            entity.phoneNumbersList = value;
        }
    })
    .setPropertyName("getPhoneNumbersList")
    .setPropertyState(new Property<PersonEntity, PropertyState>() {
        @Override
        public PropertyState get(PersonEntity entity) {
            return entity.$phoneNumbersList_state;
        }

        @Override
        public void set(PersonEntity entity, PropertyState value) {
            entity.$phoneNumbersList_state = value;
        }
    })
    .setGenerated(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .setCardinality(Cardinality.ONE_TO_MANY)
    .setMappedAttribute(new Supplier<Attribute>() {
        @Override
        public Attribute get() {
            return PhoneEntity.OWNER;
        }
    })
    .build();

    public static final Attribute<PersonEntity, MutableResult<Phone>> PHONE_NUMBERS = 
    new ResultAttributeBuilder<PersonEntity, MutableResult<Phone>, Phone>("phoneNumbers", MutableResult.class, Phone.class)
    .setProperty(new Property<PersonEntity, MutableResult<Phone>>() {
        @Override
        public MutableResult<Phone> get(PersonEntity entity) {
            return entity.phoneNumbers;
        }

        @Override
        public void set(PersonEntity entity, MutableResult<Phone> value) {
            entity.phoneNumbers = value;
        }
    })
    .setPropertyName("getPhoneNumbers")
    .setPropertyState(new Property<PersonEntity, PropertyState>() {
        @Override
        public PropertyState get(PersonEntity entity) {
            return entity.$phoneNumbers_state;
        }

        @Override
        public void set(PersonEntity entity, PropertyState value) {
            entity.$phoneNumbers_state = value;
        }
    })
    .setGenerated(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .setCascadeAction(CascadeAction.SAVE,CascadeAction.DELETE)
    .setCardinality(Cardinality.ONE_TO_MANY)
    .setMappedAttribute(new Supplier<Attribute>() {
        @Override
        public Attribute get() {
            return PhoneEntity.OWNER;
        }
    })
    .build();

    public static final QueryAttribute<PersonEntity, UUID> UUID = 
    new AttributeBuilder<PersonEntity, UUID>("uuid", UUID.class)
    .setProperty(new Property<PersonEntity, UUID>() {
        @Override
        public UUID get(PersonEntity entity) {
            return entity.uuid;
        }

        @Override
        public void set(PersonEntity entity, UUID value) {
            entity.uuid = value;
        }
    })
    .setPropertyName("getUuid")
    .setPropertyState(new Property<PersonEntity, PropertyState>() {
        @Override
        public PropertyState get(PersonEntity entity) {
            return entity.$uuid_state;
        }

        @Override
        public void set(PersonEntity entity, PropertyState value) {
            entity.$uuid_state = value;
        }
    })
    .setGenerated(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(true)
    .setLength(255)
    .build();

    public static final QueryAttribute<PersonEntity, Integer> AGE = 
    new AttributeBuilder<PersonEntity, Integer>("age", int.class)
    .setProperty(new IntProperty<PersonEntity>() {
        @Override
        public Integer get(PersonEntity entity) {
            return entity.age;
        }

        @Override
        public void set(PersonEntity entity, Integer value) {
            if(value != null) {
                entity.age = value;
            }
        }

        @Override
        public int getInt(PersonEntity entity) {
            return entity.age;
        }

        @Override
        public void setInt(PersonEntity entity, int value) {
            entity.age = value;
        }
    })
    .setPropertyName("getAge")
    .setPropertyState(new Property<PersonEntity, PropertyState>() {
        @Override
        public PropertyState get(PersonEntity entity) {
            return entity.$age_state;
        }

        @Override
        public void set(PersonEntity entity, PropertyState value) {
            entity.$age_state = value;
        }
    })
    .setGenerated(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .setLength(255)
    .build();

    public static final QueryAttribute<PersonEntity, Integer> ID = 
    new AttributeBuilder<PersonEntity, Integer>("id", int.class)
    .setProperty(new IntProperty<PersonEntity>() {
        @Override
        public Integer get(PersonEntity entity) {
            return entity.id;
        }

        @Override
        public void set(PersonEntity entity, Integer value) {
            entity.id = value;
        }

        @Override
        public int getInt(PersonEntity entity) {
            return entity.id;
        }

        @Override
        public void setInt(PersonEntity entity, int value) {
            entity.id = value;
        }
    })
    .setPropertyName("getId")
    .setPropertyState(new Property<PersonEntity, PropertyState>() {
        @Override
        public PropertyState get(PersonEntity entity) {
            return entity.$id_state;
        }

        @Override
        public void set(PersonEntity entity, PropertyState value) {
            entity.$id_state = value;
        }
    })
    .setKey(true)
    .setGenerated(true)
    .setLazy(false)
    .setNullable(false)
    .setUnique(false)
    .build();

    public static final QueryAttribute<PersonEntity, URL> HOMEPAGE = 
    new AttributeBuilder<PersonEntity, URL>("homepage", URL.class)
    .setProperty(new Property<PersonEntity, URL>() {
        @Override
        public URL get(PersonEntity entity) {
            return entity.homepage;
        }

        @Override
        public void set(PersonEntity entity, URL value) {
            entity.homepage = value;
        }
    })
    .setPropertyName("getHomepage")
    .setPropertyState(new Property<PersonEntity, PropertyState>() {
        @Override
        public PropertyState get(PersonEntity entity) {
            return entity.$homepage_state;
        }

        @Override
        public void set(PersonEntity entity, PropertyState value) {
            entity.$homepage_state = value;
        }
    })
    .setGenerated(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .build();

    public static final QueryAttribute<PersonEntity, String> NAME = 
    new AttributeBuilder<PersonEntity, String>("name", String.class)
    .setProperty(new Property<PersonEntity, String>() {
        @Override
        public String get(PersonEntity entity) {
            return entity.name;
        }

        @Override
        public void set(PersonEntity entity, String value) {
            entity.name = value;
        }
    })
    .setPropertyName("getName")
    .setPropertyState(new Property<PersonEntity, PropertyState>() {
        @Override
        public PropertyState get(PersonEntity entity) {
            return entity.$name_state;
        }

        @Override
        public void set(PersonEntity entity, PropertyState value) {
            entity.$name_state = value;
        }
    })
    .setGenerated(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .build();

    public static final Attribute<PersonEntity, MutableResult<Group>> GROUPS = 
    new ResultAttributeBuilder<PersonEntity, MutableResult<Group>, Group>("groups", MutableResult.class, Group.class)
    .setProperty(new Property<PersonEntity, MutableResult<Group>>() {
        @Override
        public MutableResult<Group> get(PersonEntity entity) {
            return entity.groups;
        }

        @Override
        public void set(PersonEntity entity, MutableResult<Group> value) {
            entity.groups = value;
        }
    })
    .setPropertyName("getGroups")
    .setPropertyState(new Property<PersonEntity, PropertyState>() {
        @Override
        public PropertyState get(PersonEntity entity) {
            return entity.$groups_state;
        }

        @Override
        public void set(PersonEntity entity, PropertyState value) {
            entity.$groups_state = value;
        }
    })
    .setGenerated(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .setCardinality(Cardinality.MANY_TO_MANY)
    .setReferencedClass(GroupEntity_PersonEntity.class)
    .setMappedAttribute(new Supplier<Attribute>() {
        @Override
        public Attribute get() {
            return GroupEntity.PERSONS;
        }
    })
    .build();

    public static final QueryAttribute<PersonEntity, Date> BIRTHDAY = 
    new AttributeBuilder<PersonEntity, Date>("birthday", Date.class)
    .setProperty(new Property<PersonEntity, Date>() {
        @Override
        public Date get(PersonEntity entity) {
            return entity.birthday;
        }

        @Override
        public void set(PersonEntity entity, Date value) {
            entity.birthday = value;
        }
    })
    .setPropertyName("getBirthday")
    .setPropertyState(new Property<PersonEntity, PropertyState>() {
        @Override
        public PropertyState get(PersonEntity entity) {
            return entity.$birthday_state;
        }

        @Override
        public void set(PersonEntity entity, PropertyState value) {
            entity.$birthday_state = value;
        }
    })
    .setGenerated(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .build();

    public static final QueryAttribute<PersonEntity, String> ABOUT = 
    new AttributeBuilder<PersonEntity, String>("about", String.class)
    .setProperty(new Property<PersonEntity, String>() {
        @Override
        public String get(PersonEntity entity) {
            return entity.about;
        }

        @Override
        public void set(PersonEntity entity, String value) {
            entity.about = value;
        }
    })
    .setPropertyName("getAbout")
    .setPropertyState(new Property<PersonEntity, PropertyState>() {
        @Override
        public PropertyState get(PersonEntity entity) {
            return entity.$about_state;
        }

        @Override
        public void set(PersonEntity entity, PropertyState value) {
            entity.$about_state = value;
        }
    })
    .setGenerated(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .build();

    public static final QueryAttribute<PersonEntity, String> EMAIL = 
    new AttributeBuilder<PersonEntity, String>("email", String.class)
    .setProperty(new Property<PersonEntity, String>() {
        @Override
        public String get(PersonEntity entity) {
            return entity.email;
        }

        @Override
        public void set(PersonEntity entity, String value) {
            entity.email = value;
        }
    })
    .setPropertyName("getEmail")
    .setPropertyState(new Property<PersonEntity, PropertyState>() {
        @Override
        public PropertyState get(PersonEntity entity) {
            return entity.$email_state;
        }

        @Override
        public void set(PersonEntity entity, PropertyState value) {
            entity.$email_state = value;
        }
    })
    .setGenerated(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .build();

    public static final Type<PersonEntity> $TYPE = new TypeBuilder<PersonEntity>(PersonEntity.class, "Person")
    .setBaseType(Person.class)
    .setCacheable(true)
    .setImmutable(false)
    .setReadOnly(false)
    .setStateless(false)
    .setFactory(new Supplier<PersonEntity>() {
        @Override
        public PersonEntity get() {
            return new PersonEntity();
        }
    })
    .setProxyProvider(new Function<PersonEntity, EntityProxy<PersonEntity>>() {
        @Override
        public EntityProxy<PersonEntity> apply(PersonEntity entity) {
            return entity.$proxy;
        }
    })
    .addAttribute(GROUPS)
    .addAttribute(EMAIL)
    .addAttribute(NAME)
    .addAttribute(PHONE_NUMBERS)
    .addAttribute(PHONE_NUMBERS_SET)
    .addAttribute(ADDRESS)
    .addAttribute(PHONE_NUMBERS_LIST)
    .addAttribute(HOMEPAGE)
    .addAttribute(ID)
    .addAttribute(UUID)
    .addAttribute(BIRTHDAY)
    .addAttribute(ABOUT)
    .addAttribute(AGE)
    .addExpression(ADDRESS_ID)
    .build();

    private PropertyState $address_state;

    private PropertyState $phoneNumbersSet_state;

    private PropertyState $phoneNumbersList_state;

    private PropertyState $phoneNumbers_state;

    private PropertyState $uuid_state;

    private PropertyState $age_state;

    private PropertyState $id_state;

    private PropertyState $homepage_state;

    private PropertyState $name_state;

    private PropertyState $groups_state;

    private PropertyState $birthday_state;

    private PropertyState $about_state;

    private PropertyState $email_state;

    private Address address;

    private Set<Phone> phoneNumbersSet;

    private List<Phone> phoneNumbersList;

    private MutableResult<Phone> phoneNumbers;

    private UUID uuid;

    private int age;

    private int id;

    private URL homepage;

    private String name;

    private MutableResult<Group> groups;

    private Date birthday;

    private String about;

    private String email;

    private final transient EntityProxy<PersonEntity> $proxy = new EntityProxy<PersonEntity>(this, $TYPE);

    public PersonEntity() {
    }

    @Override
    public Address getAddress() {
        return $proxy.get(ADDRESS);
    }

    public void setAddress(Address address) {
        $proxy.set(ADDRESS, address);
    }

    @Override
    public Set<Phone> getPhoneNumbersSet() {
        return $proxy.get(PHONE_NUMBERS_SET);
    }

    public void setPhoneNumbersSet(Set<Phone> phoneNumbersSet) {
        $proxy.set(PHONE_NUMBERS_SET, phoneNumbersSet);
    }

    @Override
    public List<Phone> getPhoneNumbersList() {
        return $proxy.get(PHONE_NUMBERS_LIST);
    }

    public void setPhoneNumbersList(List<Phone> phoneNumbersList) {
        $proxy.set(PHONE_NUMBERS_LIST, phoneNumbersList);
    }

    @Override
    public MutableResult<Phone> getPhoneNumbers() {
        return $proxy.get(PHONE_NUMBERS);
    }

    public void setPhoneNumbers(MutableResult<Phone> phoneNumbers) {
        $proxy.set(PHONE_NUMBERS, phoneNumbers);
    }

    @Override
    public UUID getUuid() {
        return $proxy.get(UUID);
    }

    public void setUuid(UUID uuid) {
        $proxy.set(UUID, uuid);
    }

    @Override
    public int getAge() {
        return $proxy.get(AGE);
    }

    public void setAge(int age) {
        $proxy.set(AGE, age);
    }

    @Override
    public int getId() {
        return $proxy.get(ID);
    }

    public void setId(int id) {
        $proxy.set(ID, id);
    }

    @Override
    public URL getHomepage() {
        return $proxy.get(HOMEPAGE);
    }

    public void setHomepage(URL homepage) {
        $proxy.set(HOMEPAGE, homepage);
    }

    @Override
    public String getName() {
        return $proxy.get(NAME);
    }

    public void setName(String name) {
        $proxy.set(NAME, name);
    }

    @Override
    public MutableResult<Group> getGroups() {
        return $proxy.get(GROUPS);
    }

    public void setGroups(MutableResult<Group> groups) {
        $proxy.set(GROUPS, groups);
    }

    @Override
    public Date getBirthday() {
        return $proxy.get(BIRTHDAY);
    }

    public void setBirthday(Date birthday) {
        $proxy.set(BIRTHDAY, birthday);
    }

    @Override
    public String getAbout() {
        return $proxy.get(ABOUT);
    }

    public void setAbout(String about) {
        $proxy.set(ABOUT, about);
    }

    @Override
    public String getEmail() {
        return $proxy.get(EMAIL);
    }

    public void setEmail(String email) {
        $proxy.set(EMAIL, email);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof PersonEntity && ((PersonEntity)obj).$proxy.equals(this.$proxy);
    }

    @Override
    public int hashCode() {
        return $proxy.hashCode();
    }

    @Override
    public String toString() {
        return $proxy.toString();
    }
}
