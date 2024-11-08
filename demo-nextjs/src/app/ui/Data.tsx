import data from "../lib/util";

interface Props {
    time: number;
}

export default async function Data({ time }: Props) {
    const data1 = await data(time);
    return (
        <div>
            <h1>
            {data1.map((d, index) => (
                <>
                {d.contenido}
                {index < data1.length - 1 && <br />}
                </>
            ))}
            </h1>
        </div>
    )
}