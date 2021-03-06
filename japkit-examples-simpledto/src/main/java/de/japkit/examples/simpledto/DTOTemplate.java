package de.japkit.examples.simpledto;

import de.japkit.annotations.RuntimeMetadata;
import de.japkit.functions.SrcInterface;
import de.japkit.functions.SrcType;
import de.japkit.metaannotations.Clazz;
import de.japkit.metaannotations.Field;
import de.japkit.metaannotations.Getter;
import de.japkit.metaannotations.Method;
import de.japkit.metaannotations.Setter;

@Clazz(nameSuffixToAppend = "DTO")
@RuntimeMetadata
public class DTOTemplate implements SrcInterface {
	@Field(src = "#{properties}", getter = @Getter, setter = @Setter)
	private SrcType $name$;

	/**
	 * <ul>
	 * <li>japkit.bodyBeforeIteratorCode return "#{name} {"+
	 * <li>japkit.bodyCode "#{name}=" + #{name} +
	 * <li>japkit.bodySeparator ", " +
	 * <li>japkit.bodyAfterIteratorCode "}";
	 * </ul>
	 */
	@Method(bodyIterator = "#{properties}", bodyIndentAfterLinebreak = true)
	@Override
	public String toString() {
		return null;
	}

}
