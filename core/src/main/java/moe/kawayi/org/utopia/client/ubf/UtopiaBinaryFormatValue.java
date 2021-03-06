//* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
// The UtopiaBinaryFormatValue.java is a part of project utopia, under MIT License.
// See https://opensource.org/licenses/MIT for license information.
// Copyright (c) 2021 moe-org All rights reserved.
//* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *

package moe.kawayi.org.utopia.client.ubf;

import moe.kawayi.org.utopia.client.util.NotNull;

import java.util.Optional;

/**
 * UtopiaBinaryFormat值
 */
public interface UtopiaBinaryFormatValue {

    /**
     * 获取值的类型
     *
     * @return 值的类型
     */
    UtopiaBinaryFormatType getType();

    /**
     * 设置Value到一个值。
     *
     * @param value 要设置的值
     */
    void setByte(byte value);

    /**
     * 设置Value到一个值。
     *
     * @param value 要设置的值
     */
    void setShort(short value);

    /**
     * 设置Value到一个值。
     *
     * @param value 要设置的值
     */
    void setInt(int value);

    /**
     * 设置Value到一个值。
     *
     * @param value 要设置的值
     */
    void setLong(long value);

    /**
     * 设置Value到一个值。
     *
     * @param value 要设置的值
     */
    void setFloat(float value);

    /**
     * 设置Value到一个值。
     *
     * @param value 要设置的值
     */
    void setDouble(double value);

    /**
     * 设置Value到一个值。
     *
     * @param value 要设置的值
     */
    void setBoolean(boolean value);

    /**
     * 设置Value到一个值。
     *
     * @param value 要设置的值
     */
    void setString(@NotNull String value);

    /**
     * 设置Value到一个值。
     *
     * @param value 要设置的值
     */
    void setArray(@NotNull UtopiaBinaryFormatArray value);

    /**
     * 设置Value到一个值。
     *
     * @param value 要设置的值
     */
    void setObject(@NotNull UtopiaBinaryFormatObject value);

    /**
     * 获取值
     *
     * @return 获取的值，如果类型不正确，则返回{@link Optional#empty()}
     */
    Optional<Byte> getByte();

    /**
     * 获取值
     *
     * @return 获取的值，如果类型不正确，则返回{@link Optional#empty()}
     */
    Optional<Short> getShort();

    /**
     * 获取值
     *
     * @return 获取的值，如果类型不正确，则返回{@link Optional#empty()}
     */
    Optional<Integer> getInt();

    /**
     * 获取值
     *
     * @return 获取的值，如果类型不正确，则返回{@link Optional#empty()}
     */
    Optional<Long> getLong();

    /**
     * 获取值
     *
     * @return 获取的值，如果类型不正确，则返回{@link Optional#empty()}
     */
    Optional<Float> getFloat();

    /**
     * 获取值
     *
     * @return 获取的值，如果类型不正确，则返回{@link Optional#empty()}
     */
    Optional<Double> getDouble();

    /**
     * 获取值
     *
     * @return 获取的值，如果类型不正确，则返回{@link Optional#empty()}
     */
    Optional<Boolean> getBoolean();

    /**
     * 获取值
     *
     * @return 获取的值，如果类型不正确，则返回{@link Optional#empty()}
     */
    Optional<String> getString();

    /**
     * 获取值
     *
     * @return 获取的值，如果类型不正确，则返回{@link Optional#empty()}
     */
    Optional<UtopiaBinaryFormatArray> getArray();

    /**
     * 获取值
     *
     * @return 获取的值，如果类型不正确，则返回{@link Optional#empty()}
     */
    Optional<UtopiaBinaryFormatObject> getObject();
}
